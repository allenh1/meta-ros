# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The diagnostic_analysis package can convert a log of diagnostics data     into a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native diagnostic-msgs rosbag roslib rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/diagnostic_analysis/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a1840718f6d4f69e173caded2d09e74d"
SRC_URI[sha256sum] = "acc00ff538b26a682b70e8d5b1d093d5738764f81fa4e9186e41ef2d6eb97bae"
S = "${WORKDIR}/diagnostics-release-release-lunar-diagnostic_analysis-1.9.2-0"

inherit catkin
