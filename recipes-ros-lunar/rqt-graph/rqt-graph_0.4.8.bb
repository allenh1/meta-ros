# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS       computation graph."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-dotgraph rosgraph rosgraph-msgs roslib rosnode rospy rosservice rostopic rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_graph-release/archive/release/lunar/rqt_graph/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b91d0e006bfe43c88c05c02e79ee85af"
SRC_URI[sha256sum] = "113bb8298af2e3fb3513171f895a8c540daf405f30736fde0787f3847a7c9531"
S = "${WORKDIR}/rqt_graph-release-release-lunar-rqt_graph-0.4.8-0"

inherit catkin
