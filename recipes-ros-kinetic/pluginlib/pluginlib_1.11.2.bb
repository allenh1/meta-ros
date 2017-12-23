# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native class-loader cmake-modules rosconsole roslib libtinyxml2"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.11.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed24772f6d814a8a541261a4c7381154"
SRC_URI[sha256sum] = "b4d5e930606975d7e2865759665a9bfe793ec816f9f2a79883bd09e04d9043b7"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.11.2-0"

inherit catkin
