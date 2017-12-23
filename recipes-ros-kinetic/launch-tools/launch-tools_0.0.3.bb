# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS tools and scripts related to launchfiles"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roslib rospy xdot"
SRC_URI = "https://github.com/srv/srv_tools-release/archive/release/kinetic/launch_tools/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f5615d95437ddc37ecb744a3889dad2"
SRC_URI[sha256sum] = "39802253ffe256d4f061497bb3211da77348bad55a6d533e0d502cd777cc3419"
S = "${WORKDIR}/srv_tools-release-release-kinetic-launch_tools-0.0.3-0"

inherit catkin
