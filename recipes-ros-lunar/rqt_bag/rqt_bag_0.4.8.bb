# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=90ee53c1283adab03f0637d4d986bf3b"

DEPENDS = "catkin python-rospkg python_qt_binding rosbag rosgraph_msgs roslib rosnode rospy rqt_gui rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/lunar/rqt_bag/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b6054349258073641a91d538ed8e53e6"
SRC_URI[sha256sum] = "831cdda74618702ff2929858bb40b8d09e6f7aae85220ba81dc3f72169ec862b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
