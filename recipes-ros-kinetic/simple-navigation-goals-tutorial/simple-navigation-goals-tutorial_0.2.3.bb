# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The simple_navigation_goals_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native move-base-msgs roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/kinetic/simple_navigation_goals_tutorial/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d682ff2dbe9de907e0d720686709dd32"
SRC_URI[sha256sum] = "c10b2a1e98aa617b16dbea9340eb73e50cc8b5184f1bd454884d0b6505a09d9f"
S = "${WORKDIR}/navigation_tutorials-release-release-kinetic-simple_navigation_goals_tutorial-0.2.3-0"

inherit catkin
