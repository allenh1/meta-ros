# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "octovis is visualization tool for the OctoMap library based on Qt and libQGLView"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin-native cmake libqglviewer-qt4 libqglviewer-qt4-dev libqt4-dev libqt4-opengl libqt4-opengl-dev libqtgui4 octomap"
SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/kinetic/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f903aab517ca7da11cace03954b5fc1"
SRC_URI[sha256sum] = "3c29b6a392cf48985126527130fdc378e60e0987e2cd63c65cdda6e90bbc282b"
S = "${WORKDIR}/octomap-release-release-kinetic-${PN}-1.8.1-0"

inherit catkin
