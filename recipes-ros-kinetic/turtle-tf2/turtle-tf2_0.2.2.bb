# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtle_tf2 demonstrates how to write a tf2 broadcaster and listener with the tur"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp rospy std-msgs tf2 tf2-ros turtlesim"
SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/kinetic/turtle_tf2/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cb6dba58eecad847c989fc133a53efe9"
SRC_URI[sha256sum] = "470185575edd830b92689f8cd433ba62767cfbcb3e7f237bfedb67a419619bbe"
S = "${WORKDIR}/geometry_tutorials-release-release-kinetic-turtle_tf2-0.2.2-0"

inherit catkin
