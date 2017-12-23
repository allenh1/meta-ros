# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The op3_action_module package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native dynamixel-sdk op3-action-module-msgs robotis-controller-msgs robotis-device robotis-framework-common roscpp std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-release/archive/release/kinetic/op3_action_module/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0e8e54662565b9504cd23229cd45c49c"
SRC_URI[sha256sum] = "a3ce123e58a6893ffb3aac2eb017f47b24501a6640896c9b56d056688b73f324"
S = "${WORKDIR}/ROBOTIS-OP3-release-release-kinetic-op3_action_module-0.1.1-0"

inherit catkin
