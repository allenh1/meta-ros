# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-rospkg python-qt-binding rosbag rosgraph-msgs roslib rosnode rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/lunar/rqt_bag/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b6be8833eaeea3395e676bb4ed7fbc7"
SRC_URI[sha256sum] = "e85f4ef68a8672459e10d2c855cdb2529422d42dce41b2f2c2c39e636cecf522"
S = "${WORKDIR}/rqt_bag-release-release-lunar-rqt_bag-0.4.11-0"

inherit catkin
