# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The sensor_module_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robotis-framework-common roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-MPC-release/archive/release/kinetic/sensor_module_tutorial/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ef21779136147492d87def0e81f83626"
SRC_URI[sha256sum] = "fa470b03f93e118fe309bda8047d89dbeefba17b61cd90615faadcb5a2da046c"
S = "${WORKDIR}/ROBOTIS-THORMANG-MPC-release-release-kinetic-sensor_module_tutorial-0.1.3-0"

inherit catkin
