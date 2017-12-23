# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules control-msgs dynamic-reconfigure message-generation message-runtime realtime-tools roscpp std-msgs libtinyxml"
SRC_URI = "https://github.com/ros-gbp/control_toolbox-release/archive/release/kinetic/control_toolbox/1.16.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f02a9157f7f0380798111e7e51c571b4"
SRC_URI[sha256sum] = "7e30e354e7759ff18761aab851d6c88a87295474bb6f628ee67a562a0e0794ee"
S = "${WORKDIR}/control_toolbox-release-release-kinetic-control_toolbox-1.16.0-0"

inherit catkin
