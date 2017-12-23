# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ncd_parser package reads in .alog data files from the New College Dataset an"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/scan_tools-release/archive/release/kinetic/ncd_parser/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e97197469e489e521106da21a98c3d6"
SRC_URI[sha256sum] = "df4fc052d4ebdf9d6073d197453be6dccca14d2b3861fdf79edfc6c400aa3aee"
S = "${WORKDIR}/scan_tools-release-release-kinetic-ncd_parser-0.3.2-0"

inherit catkin
