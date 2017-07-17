# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_action provides a feature to introspect all available ROS
  action (from act"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rospy rqt_msg rqt_py_common"
SRC_URI = "https://github.com/ros-gbp/rqt_action-release/archive/release/lunar/rqt_action/0.4.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2ce7e6c67137ce8dbf8019d0d2bcb24"
SRC_URI[sha256sum] = "93756c5b6b31b81b99c2d7dd0ff3fd038f04a01b694e4427201c0ba6f1368769"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
