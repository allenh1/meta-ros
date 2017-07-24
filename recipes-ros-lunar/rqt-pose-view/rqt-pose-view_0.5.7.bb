# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_pose_view provides a GUI plugin for visualizing 3D poses."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs gl-dependency python-opengl python-rospkg python-qt-binding rospy rostopic rqt-gui rqt-gui-py rqt-py-common tf"
SRC_URI = "https://github.com/ros-gbp/rqt_pose_view-release/archive/release/lunar/rqt_pose_view/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "995f9d8f75c8c4bfb156237c874962a0"
SRC_URI[sha256sum] = "a12a33c6d515475fb095391f978aaa0b7f3256080874a4aac9eec990f4e0e268"
S = "${WORKDIR}/rqt_pose_view-release-release-lunar-rqt_pose_view-0.5.7-0"

inherit catkin
