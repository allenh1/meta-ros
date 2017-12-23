# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides some objects and furniture for gazebo simulation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-description gazebo-ros roslaunch"
SRC_URI = "https://github.com/ipa320/cob_simulation-release/archive/release/kinetic/cob_gazebo_objects/0.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f3e357c2aab3dea5bedfa49309b052a"
SRC_URI[sha256sum] = "a5406a4e6404ddc5825a7ad9a6c5b405a1a5848a47b13e31e0418dd85d491cf9"
S = "${WORKDIR}/cob_simulation-release-release-kinetic-cob_gazebo_objects-0.6.8-0"

inherit catkin
