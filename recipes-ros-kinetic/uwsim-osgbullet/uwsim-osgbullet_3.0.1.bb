# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The OSG Bullet library adapted to UWSim. See https://code.google.com/p/osgbullet"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cmake libopenscenegraph uwsim-bullet uwsim-osgworks"
SRC_URI = "https://github.com/uji-ros-pkg/uwsim_osgbullet-release/archive/release/kinetic/uwsim_osgbullet/3.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1602ecde8c0c8f719018e1913c7f59f8"
SRC_URI[sha256sum] = "a3b912aa1c36abd61d916a60ae4fb67596cdb5893de4caa5f2ae2ca93368ea6e"
S = "${WORKDIR}/uwsim_osgbullet-release-release-kinetic-uwsim_osgbullet-3.0.1-0"

inherit catkin
