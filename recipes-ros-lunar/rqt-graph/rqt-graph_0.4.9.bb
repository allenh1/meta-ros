# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS       computation graph."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-dotgraph rosgraph rosgraph-msgs roslib rosnode rospy rosservice rostopic rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_graph-release/archive/release/lunar/rqt_graph/0.4.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24266b22890a7dfdd95b9ce352e5aca6"
SRC_URI[sha256sum] = "7c25ab92d9b82a4fa51fe4526f6a7edb83f4344cda7c8ad620aae62c186cce23"
S = "${WORKDIR}/rqt_graph-release-release-lunar-rqt_graph-0.4.9-0"

inherit catkin
