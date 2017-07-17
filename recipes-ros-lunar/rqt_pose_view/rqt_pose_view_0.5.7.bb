# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_pose_view provides a GUI plugin for visualizing 3D poses."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=96565d25cd11bbf6729a1e311803f70d"

DEPENDS = "catkin geometry_msgs gl_dependency python-opengl python-rospkg python_qt_binding rospy rostopic rqt_gui rqt_gui_py rqt_py_common tf"
SRC_URI = "https://github.com/ros-gbp/rqt_pose_view-release/archive/release/lunar/rqt_pose_view/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "995f9d8f75c8c4bfb156237c874962a0"
SRC_URI[sha256sum] = "a12a33c6d515475fb095391f978aaa0b7f3256080874a4aac9eec990f4e0e268"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
