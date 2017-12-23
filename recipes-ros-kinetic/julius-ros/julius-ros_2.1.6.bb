# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The julius_ros package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "audio-capture audio-common-msgs catkin-native julius julius-voxforge nkf python-lxml python-rospkg rospy sound-play speech-recognition-msgs std-srvs"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/julius_ros/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "629e8e4e34808327aeb408b98743fe7e"
SRC_URI[sha256sum] = "8abb62f153a85edcd3eb0bb34cfef9f9020e6e4e01d57a8f158466a0ae8c5eab"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-julius_ros-2.1.6-0"

inherit catkin
