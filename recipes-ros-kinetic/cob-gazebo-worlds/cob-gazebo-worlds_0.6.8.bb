# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides some worlds for gazebo simulation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-default-env-config controller-manager gazebo-msgs gazebo-ros gazebo-ros-control joint-state-controller joint-state-publisher position-controllers robot-state-publisher roslaunch rospy std-msgs tf velocity-controllers xacro"
SRC_URI = "https://github.com/ipa320/cob_simulation-release/archive/release/kinetic/cob_gazebo_worlds/0.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0bec250c3a607efc91b342263a533b12"
SRC_URI[sha256sum] = "be0e3c10391bdf8028ef997e0540b2b4610d69839fa74f2ee61895d09d1c1766"
S = "${WORKDIR}/cob_simulation-release-release-kinetic-cob_gazebo_worlds-0.6.8-0"

inherit catkin
