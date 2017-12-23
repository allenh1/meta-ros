# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This rqt plugin ROS package provides easy view of .launch files.   User can also"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt-binding roslaunch rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_launch-release/archive/release/kinetic/rqt_launch/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "92793638804c763a55d059401ccbd05d"
SRC_URI[sha256sum] = "4d52dc7d995ffe9e219c30f3c85ad15ed33ef5f7b87e216d48175da77302a242"
S = "${WORKDIR}/rqt_launch-release-release-kinetic-rqt_launch-0.4.8-0"

inherit catkin
