# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The open_cr_module package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=9ed539f6175b7e00bfd99b36cfbcbd73"

DEPENDS = "catkin-native cmake-modules dynamixel-sdk robotis-controller-msgs robotis-device robotis-framework-common robotis-math roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-release/archive/release/kinetic/open_cr_module/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b11ba401aee0127891d09a4653a8b9d"
SRC_URI[sha256sum] = "d797b224ad546357ef77682eb748881206f50abce8c5adf911eb2832a3b94e8b"
S = "${WORKDIR}/ROBOTIS-OP3-release-release-kinetic-open_cr_module-0.1.1-0"

inherit catkin
