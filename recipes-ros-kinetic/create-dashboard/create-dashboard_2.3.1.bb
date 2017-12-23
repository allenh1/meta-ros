# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Create dashboard is a RQT-based plug-in for visualising data from the Create"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native create-node diagnostic-msgs rospy rqt-gui rqt-gui-py rqt-robot-dashboard"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_create_desktop-release/archive/release/kinetic/create_dashboard/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "775bf09310b899587db8fcb108baf311"
SRC_URI[sha256sum] = "51da3f9990ea493f2626da4186eb7bfc7055a4d0de39959478c09477f0aab9e7"
S = "${WORKDIR}/turtlebot_create_desktop-release-release-kinetic-create_dashboard-2.3.1-0"

inherit catkin
