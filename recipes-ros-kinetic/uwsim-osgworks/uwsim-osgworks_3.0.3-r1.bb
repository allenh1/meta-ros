# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The OSG Works library adapted to UWSim. See https://code.google.com/p/osgworks"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cmake libopenscenegraph opengl"
SRC_URI = "https://github.com/uji-ros-pkg/uwsim_osgworks-release/archive/release/kinetic/uwsim_osgworks/3.0.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "993c040d92f5a290c45e35af931c3090"
SRC_URI[sha256sum] = "2a509179c47ceaf57e6bf4b620eaf1bb70f5014dde5fe6925c3cd82923e61c68"
S = "${WORKDIR}/uwsim_osgworks-release-release-kinetic-uwsim_osgworks-3.0.3-1"

inherit catkin
