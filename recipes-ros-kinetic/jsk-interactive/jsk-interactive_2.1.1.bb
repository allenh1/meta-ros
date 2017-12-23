# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_interactive"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native dynamic-tf-publisher geometry-msgs jsk-interactive-marker mk rosbuild rospy visualization-msgs"
SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/kinetic/jsk_interactive/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "61ecd77ae59f89bef3006b4c1f4a811b"
SRC_URI[sha256sum] = "46a8be27050ee0dde3268c4f9e2458d9ec7cd5a735ef938a041455cc52eab173"
S = "${WORKDIR}/jsk_visualization-release-release-kinetic-jsk_interactive-2.1.1-0"

inherit catkin
