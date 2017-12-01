# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules control-msgs dynamic-reconfigure message-generation message-runtime realtime-tools roscpp std-msgs libtinyxml"
SRC_URI = "https://github.com/ros-gbp/control_toolbox-release/archive/release/lunar/control_toolbox/1.15.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5486f09e0d51f1aa14b9b1853d15cce0"
SRC_URI[sha256sum] = "f70698efc16544dd14861f5782efe48c47cc2dc98329ba20defa3df508ba0846"
S = "${WORKDIR}/control_toolbox-release-release-lunar-control_toolbox-1.15.0-0"

inherit catkin
