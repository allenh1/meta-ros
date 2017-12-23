# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "osg_markers can be used to create Markers geometry in OSG."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libopenscenegraph roscpp roslib tf visualization-msgs"
SRC_URI = "https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/kinetic/osg_markers/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a706389bf777f25fb6d7cc59f5c3921"
SRC_URI[sha256sum] = "fe9a3e9e95560170f90486fbe707f734c1b983a35912ef2425e8992f4147d0a2"
S = "${WORKDIR}/visualization_osg-release-release-kinetic-osg_markers-1.0.2-0"

inherit catkin
