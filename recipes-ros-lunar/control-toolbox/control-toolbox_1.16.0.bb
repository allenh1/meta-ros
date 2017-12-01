# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules control-msgs dynamic-reconfigure message-generation message-runtime realtime-tools roscpp std-msgs libtinyxml"
SRC_URI = "https://github.com/ros-gbp/control_toolbox-release/archive/release/lunar/control_toolbox/1.16.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fd77e7194b28723399ea3b94880128db"
SRC_URI[sha256sum] = "b38d1b39b0328ba87e4f7c6b777039183c65a8a3007063f84b491a202a0f8610"
S = "${WORKDIR}/control_toolbox-release-release-lunar-control_toolbox-1.16.0-0"

inherit catkin
