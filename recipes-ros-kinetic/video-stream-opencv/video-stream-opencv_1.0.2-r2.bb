# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The video_stream_opencv package contains a node to publish a video stream (the p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native cv-bridge image-transport roscpp rospy sensor-msgs"
SRC_URI = "https://github.com/ros-drivers/video_stream_opencv-release/archive/release/kinetic/video_stream_opencv/1.0.2-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fbf0ffb70b03283a34a12582b60a84ce"
SRC_URI[sha256sum] = "96da6217609c78f97500a16cfdb6f0f01f423caeb0c5883bddb94c6906595ddd"
S = "${WORKDIR}/video_stream_opencv-release-release-kinetic-video_stream_opencv-1.0.2-2"

inherit catkin
