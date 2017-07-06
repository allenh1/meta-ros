# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=3b91e5c038b82a7cd68bc691a0162e6c"

DEPENDS = "catkin cmake libqglviewer-qt4 libqglviewer-qt4-dev libqt4-dev libqt4-opengl libqt4-opengl-dev libqtgui4 octomap"
SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/lunar/octovis/1.9.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "40e3c09f83a95fa2fcf67d48e60b3995"
SRC_URI[sha256sum] = "028f1cc7f6d6d8f2308c9e6aba294032f129eac75877228bf1a476f71e70385d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
