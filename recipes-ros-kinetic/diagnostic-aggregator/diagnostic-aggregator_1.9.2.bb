# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostic_aggregator"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bondcpp bondpy catkin-native diagnostic-msgs pluginlib roscpp rospy rostest xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/kinetic/diagnostic_aggregator/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d582d92be411f633905d6a8f29a6785"
SRC_URI[sha256sum] = "f0a2eaff1ae4390786a06d578be30180fb3b42ff661b8b26f8b7871889522ca6"
S = "${WORKDIR}/diagnostics-release-release-kinetic-diagnostic_aggregator-1.9.2-0"

inherit catkin
