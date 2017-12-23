# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk interactive markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native cmake-modules dynamic-reconfigure dynamic-tf-publisher eigen-conversions geometry-msgs interactive-markers jsk-footstep-msgs jsk-recognition-msgs jsk-rviz-plugins jsk-topic-tools message-filters message-generation message-runtime mk moveit-msgs rosbuild roscpp roseus roslib rviz sensor-msgs tf tf-conversions libtinyxml urdf visualization-msgs yaml-cpp"
SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/kinetic/jsk_interactive_marker/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8203d2a4793d43085ec66e572b6021c0"
SRC_URI[sha256sum] = "347bb8e3c0b39deecf40a82d89c7ea47b80dee1d7396904c422713b91beffbfc"
S = "${WORKDIR}/jsk_visualization-release-release-kinetic-jsk_interactive_marker-2.1.1-0"

inherit catkin
