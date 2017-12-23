# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package holds example launch files for running the ROS navigation stack in "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl catkin-native fake-localization gmapping map-server move-base stage-ros"
SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/kinetic/navigation_stage/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b07dcd720378362e8c311704276c3b13"
SRC_URI[sha256sum] = "c6e95bd91459bdc458ce90fc9606838c7c098a4fe61dbcfe25d759bd9b935f0d"
S = "${WORKDIR}/navigation_tutorials-release-release-kinetic-navigation_stage-0.2.3-0"

inherit catkin
