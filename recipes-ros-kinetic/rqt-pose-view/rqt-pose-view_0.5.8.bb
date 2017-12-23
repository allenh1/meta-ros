# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_pose_view provides a GUI plugin for visualizing 3D poses."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs gl-dependency python-opengl python-rospkg python-qt-binding rospy rostopic rqt-gui rqt-gui-py rqt-py-common tf"
SRC_URI = "https://github.com/ros-gbp/rqt_pose_view-release/archive/release/kinetic/rqt_pose_view/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a280152ddcdea6c43764d39e556f5130"
SRC_URI[sha256sum] = "edc43dd3e9e64426de3841b197e9980e330b2c6678a12917e50f3a20c9e4d5e9"
S = "${WORKDIR}/rqt_pose_view-release-release-kinetic-rqt_pose_view-0.5.8-0"

inherit catkin
