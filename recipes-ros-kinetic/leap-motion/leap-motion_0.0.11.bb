# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS driver for the Leap Motion gesture sensor"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers camera-info-manager catkin-native geometry-msgs image-transport message-generation message-runtime roscpp roslib rospack rospy std-msgs visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/leap_motion-release/archive/release/kinetic/leap_motion/0.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1a557a57ba94d86d15ef84eb7f941761"
SRC_URI[sha256sum] = "49727838a653c082ad74e74e2dd60c3e4c3017121be5cbdf0ccf0931ef6da938"
S = "${WORKDIR}/leap_motion-release-release-kinetic-leap_motion-0.0.11-0"

inherit catkin
