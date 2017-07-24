# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost python-empy-native class-loader cmake-modules rosconsole roslib libtinyxml"
SRC_URI = "https://github.com/ros-gbp/pluginlib-release/archive/release/lunar/pluginlib/1.10.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7b42817fee923ffdad967b6027cacece"
SRC_URI[sha256sum] = "52757ac820e93b77a2151428c44099b7b0a995d7e1480a99105679e944f83daa"
S = "${WORKDIR}/pluginlib-release-release-lunar-pluginlib-1.10.5-0"

inherit catkin
