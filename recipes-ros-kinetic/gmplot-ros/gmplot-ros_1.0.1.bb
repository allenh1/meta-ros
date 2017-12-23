# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for gmplot_ros"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gmplot gmplot-msgs"
SRC_URI = "https://github.com/robustify/gmplot_ros-release/archive/release/kinetic/gmplot_ros/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b868bca26adbc313d60a58ec87a8cdae"
SRC_URI[sha256sum] = "0114f91d70b20e5dc6d32a0aa3bb9de3e4c1b9bddefbbc601afca64d1e14e5ce"
S = "${WORKDIR}/gmplot_ros-release-release-kinetic-gmplot_ros-1.0.1-0"

inherit catkin
