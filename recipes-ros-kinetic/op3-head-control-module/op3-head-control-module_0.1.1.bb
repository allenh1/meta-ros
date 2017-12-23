# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The op3_head_control_module package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native cmake-modules dynamixel-sdk robotis-controller-msgs robotis-device robotis-framework-common robotis-math roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-release/archive/release/kinetic/op3_head_control_module/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d99265ec7b4f8d1d9c8d7140fbcfa42c"
SRC_URI[sha256sum] = "bdc63204dbfca65a5cdec5d78445e9b021353f04cf0b20a27e266ce900e2a2be"
S = "${WORKDIR}/ROBOTIS-OP3-release-release-kinetic-op3_head_control_module-0.1.1-0"

inherit catkin
