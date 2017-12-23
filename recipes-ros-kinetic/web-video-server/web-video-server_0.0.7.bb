# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "HTTP Streaming of ROS Image Topics in Multiple Formats"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "async-web-server-cpp catkin-native cv-bridge ffmpeg image-transport roscpp roslib"
SRC_URI = "https://github.com/RobotWebTools-release/web_video_server-release/archive/release/kinetic/web_video_server/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "67ef1a9a129e1caba63be8e976cef3e7"
SRC_URI[sha256sum] = "1013a8d15c40dad86d88a927e16c82482d9e6eb73af6c125e9ec8f10af1c4c54"
S = "${WORKDIR}/web_video_server-release-release-kinetic-web_video_server-0.0.7-0"

inherit catkin
