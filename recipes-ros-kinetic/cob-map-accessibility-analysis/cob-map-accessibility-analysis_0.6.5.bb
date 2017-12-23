# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_map_accessibility_analysis receives the map from navigation as well as obsta"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cob-3d-mapping-msgs cv-bridge geometry-msgs image-transport libopencv-dev libpcl-all-dev message-filters message-generation message-runtime nav-msgs pcl-ros roscpp rospy sensor-msgs tf"
SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/kinetic/cob_map_accessibility_analysis/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c42af09588aa4ac9b726b86a36eb6cfb"
SRC_URI[sha256sum] = "117823d4a616a39048768b475a09a03f212e8463b9823626bf9aac17643628c2"
S = "${WORKDIR}/cob_navigation-release-release-kinetic-cob_map_accessibility_analysis-0.6.5-0"

inherit catkin
