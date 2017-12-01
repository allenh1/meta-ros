# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_nav_view provides a gui for viewing navigation maps and paths."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs nav-msgs python-qt-binding qt-gui rospy rqt-gui rqt-gui-py rqt-py-common tf"
SRC_URI = "https://github.com/ros-gbp/rqt_nav_view-release/archive/release/lunar/rqt_nav_view/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0df8cf971823e29376dbea50e242de9"
SRC_URI[sha256sum] = "20aa0131afe3ea6f00e8dc41e6a5a1e9f4b79c9b477ab922d1dc99499c41a0f2"
S = "${WORKDIR}/rqt_nav_view-release-release-lunar-rqt_nav_view-0.5.7-0"

inherit catkin
