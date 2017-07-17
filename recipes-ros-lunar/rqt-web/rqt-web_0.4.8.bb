# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_web is a simple web content viewer for rqt. Users can show web content in Qt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-rospkg python_qt_binding qt_gui rospy rqt_gui rqt_gui_py webkit_dependency"
SRC_URI = "https://github.com/ros-gbp/rqt_web-release/archive/release/lunar/rqt_web/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0bfee1bb1b145a1a5814f6a0c2d54dd"
SRC_URI[sha256sum] = "7ce772b6f7fed4b5d14c1397b0d1bd92fb7b1e154e0d2b43642dde61c2723975"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
