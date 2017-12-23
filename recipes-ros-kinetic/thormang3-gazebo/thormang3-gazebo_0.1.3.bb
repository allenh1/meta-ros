# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The thormang3_gazebo package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-Common-release/archive/release/kinetic/thormang3_gazebo/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "883c4ed295b544604baf7ef7ecd19cfb"
SRC_URI[sha256sum] = "57eeeb6405de58868b5754406cc43b2770262dd7ee77cb2222c73376c9f19d62"
S = "${WORKDIR}/ROBOTIS-THORMANG-Common-release-release-kinetic-thormang3_gazebo-0.1.3-0"

inherit catkin
