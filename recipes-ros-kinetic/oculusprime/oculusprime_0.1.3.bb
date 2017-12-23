# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Oculus Prime ROS Interface"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "amcl catkin-native depthimage-to-laserscan dwa-local-planner dynamic-reconfigure gmapping map-server move-base nodelet openni2-camera openni2-launch pcl-ros roscpp rospy std-msgs visualization-msgs"
SRC_URI = "https://github.com/xaxxontech/${PN}_ros-release/archive/release/kinetic/${PN}/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "314a815aefe6ef923e7ffa982ad277cd"
SRC_URI[sha256sum] = "6daabd727850d25eda5451634f17666297ae5dad0fd15cf67b088a538f4eea9f"
S = "${WORKDIR}/${PN}_ros-release-release-kinetic-${PN}-0.1.3-0"

inherit catkin
