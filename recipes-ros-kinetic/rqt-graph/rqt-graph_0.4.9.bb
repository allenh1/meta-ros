# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS       computation graph."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-dotgraph rosgraph rosgraph-msgs roslib rosnode rospy rosservice rostopic rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_graph-release/archive/release/kinetic/rqt_graph/0.4.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "13d5a523ed27f5b51c1cc70fa5eed60c"
SRC_URI[sha256sum] = "6907a2f583bd3dd212a988ec918b1b6e4e1141be1565cdf138c86c9e4e9a566b"
S = "${WORKDIR}/rqt_graph-release-release-kinetic-rqt_graph-0.4.9-0"

inherit catkin
