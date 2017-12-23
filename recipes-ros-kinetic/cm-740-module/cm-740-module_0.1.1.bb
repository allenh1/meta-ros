# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cm_740_module package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native cmake-modules dynamixel-sdk robotis-controller-msgs robotis-device robotis-framework-common robotis-math roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-release/archive/release/kinetic/cm_740_module/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5e6235eae2b7e983aae89bbdafddab4"
SRC_URI[sha256sum] = "599a3a8f083796e1517d61b8fe601fff8c4ad9220bfe61b2f4068a6b4601a87c"
S = "${WORKDIR}/ROBOTIS-OP3-release-release-kinetic-cm_740_module-0.1.1-0"

inherit catkin
