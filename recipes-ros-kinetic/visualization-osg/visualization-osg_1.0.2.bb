# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visualization_osg is a metapackage providing support for visualization of geomet"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native osg-interactive-markers osg-markers osg-utils"
SRC_URI = "https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/kinetic/visualization_osg/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9bbd77be84d40630869a1b155f16f3ac"
SRC_URI[sha256sum] = "d7ef3241bf680df325db7cc7496308c8c261ab4b2524c6e6b674cada7c85f32e"
S = "${WORKDIR}/visualization_osg-release-release-kinetic-visualization_osg-1.0.2-0"

inherit catkin
