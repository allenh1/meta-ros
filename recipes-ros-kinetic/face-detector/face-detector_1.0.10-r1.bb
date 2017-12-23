# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Face detection in images."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native cv-bridge dynamic-reconfigure geometry-msgs image-geometry image-transport message-generation message-runtime openni-launch people-msgs rosbag roscpp roslib rospy sensor-msgs std-msgs std-srvs stereo-msgs tf"
SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/kinetic/face_detector/1.0.10-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eac552f82da606f786c2aec0d6cbc569"
SRC_URI[sha256sum] = "46991994242d87c7379b7763ef936e3bd317f7a470e691d14433dff4b817e4f7"
S = "${WORKDIR}/people-release-release-kinetic-face_detector-1.0.10-1"

inherit catkin
