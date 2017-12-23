# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The op3_direct_control_module package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native cmake-modules dynamixel-sdk op3-kinematics-dynamics robotis-controller-msgs robotis-device robotis-math roscpp std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-release/archive/release/kinetic/op3_direct_control_module/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bf34c2ee41eceed6ba88a394588785fe"
SRC_URI[sha256sum] = "385586f7c87a3e3d629e47a179c581d616d3a314213f81d815686e1d7a0fd0dd"
S = "${WORKDIR}/ROBOTIS-OP3-release-release-kinetic-op3_direct_control_module-0.1.1-0"

inherit catkin
