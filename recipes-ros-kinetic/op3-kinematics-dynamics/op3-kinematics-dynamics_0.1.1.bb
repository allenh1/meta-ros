# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The op3_kinematics_dynamics package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native cmake-modules robotis-math roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-release/archive/release/kinetic/op3_kinematics_dynamics/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1cd79ba642e9aaa3670c387ca6d59ef8"
SRC_URI[sha256sum] = "9952f29c9167972f576a43449f26c86874fcfdfa88850ca1816dd3c5f49591b0"
S = "${WORKDIR}/ROBOTIS-OP3-release-release-kinetic-op3_kinematics_dynamics-0.1.1-0"

inherit catkin
