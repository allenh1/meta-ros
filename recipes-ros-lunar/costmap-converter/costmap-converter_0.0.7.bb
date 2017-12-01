# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ros package that includes plugins and nodes to convert occupied costmap2d cell"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native costmap-2d cv-bridge dynamic-reconfigure geometry-msgs message-generation message-runtime pluginlib roscpp std-msgs"
SRC_URI = "https://github.com/rst-tu-dortmund/costmap_converter-release/archive/release/lunar/costmap_converter/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "00707f0e542a4286515a35a33f1fd82c"
SRC_URI[sha256sum] = "4916b2d79d6b7976015a07aef99e57ec859c1fd5986c103f57458882bd8457c7"
S = "${WORKDIR}/costmap_converter-release-release-lunar-costmap_converter-0.0.7-0"

inherit catkin
