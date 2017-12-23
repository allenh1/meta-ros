# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implementation of  for ROS, extending on the existing navigation stack (costmap_"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native costmap-2d dynamic-reconfigure geometry-msgs libpcl-all libpcl-all-dev message-generation message-runtime move-base-msgs roscpp std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/paulbovbel/frontier_exploration-release/archive/release/kinetic/frontier_exploration/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "02dec4ef4809311376693a0d2d0bdde1"
SRC_URI[sha256sum] = "e8a0a4a49987f30897611c7e0d8edc76ab63e82a607db095a6fc5aa2633c4e22"
S = "${WORKDIR}/frontier_exploration-release-release-kinetic-frontier_exploration-0.3.1-0"

inherit catkin
