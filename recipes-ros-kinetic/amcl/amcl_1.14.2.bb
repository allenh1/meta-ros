# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=58d727014cda5ed405b7fb52666a1f97"

DEPENDS = "catkin-native dynamic-reconfigure message-filters nav-msgs rosbag roscpp std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/${PN}/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60c77c25d3ce4e44be1d092e0c3ececd"
SRC_URI[sha256sum] = "e2ef395d43b93c36d5c140b0993f061d9fc1e15ccc683d79a6408ccc42ec3b60"
S = "${WORKDIR}/navigation-release-release-kinetic-${PN}-1.14.2-0"

inherit catkin
