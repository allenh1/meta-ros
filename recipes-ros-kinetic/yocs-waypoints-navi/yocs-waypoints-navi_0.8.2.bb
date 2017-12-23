# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple tool for waypoints navigation with two functions:      * Command the robo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native geometry-msgs move-base-msgs nav-msgs roscpp tf visualization-msgs yocs-math-toolkit yocs-msgs"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_waypoints_navi/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f38e201c9691583488cb55f124677b20"
SRC_URI[sha256sum] = "b46bed975e91b289dcaced09a2a612e48a3efd212a34bb9b87b2b209aac3888d"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_waypoints_navi-0.8.2-0"

inherit catkin
